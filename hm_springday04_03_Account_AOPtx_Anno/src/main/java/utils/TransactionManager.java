package utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 和事务管理相关的工具类，它包含了，开启事务，提交事务，回滚事务和释放连接
 */
@Component("tsManger")
@Aspect
public class TransactionManager {

    //获取当前线程的connection
    @Autowired
    private ConnectionUtils connectionUtils;

    //切面表达式
    @Pointcut("execution(* service.impl.*.*(..))")
    private void pt1(){}

    /**
     * 开启事务
     */
    public void beginTransaction(){
        try {
            connectionUtils.getThreadConnection().setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 提交事务
     */
    public void commit(){
        try {
            connectionUtils.getThreadConnection().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 回滚事务
     */
    public void rollback(){
        try {
            connectionUtils.getThreadConnection().rollback();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭事务--释放连接
     */
    public void release(){
        try {
            connectionUtils.getThreadConnection().close();
            connectionUtils.removeConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Around("pt1()")
    public Object aroundAdvice(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try{
            //1、获取参数
            Object[] args = pjp.getArgs();
            //3、开始事务
            this.beginTransaction();
            //3、执行方法
            rtValue = pjp.proceed(args);
            //4、提交事务
            this.commit();

            //返回结果
            return rtValue;

        }catch (Throwable e){
            //5、回滚事务
            this.rollback();
            throw new RuntimeException(e);
        }finally {
            //6、释放资源
            this.release();
        }
    }
}
