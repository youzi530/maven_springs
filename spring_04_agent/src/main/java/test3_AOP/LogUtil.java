package test3_AOP;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogUtil {

    public void beforeLog(){
        System.out.println("前置——记录日志");
    }

    public void afterLog(){
        System.out.println("后置——记录日志");
    }

    public void afterLog1(Object object){
        System.out.println("后置——记录日志");
        System.out.println(object);
    }

    public void afterFinalLog(){
        System.out.println("最终通牒——记录日志");
    }

    public void throwLog(){
        System.out.println("异常——记录日志");
    }


    public void arroundLog(ProceedingJoinPoint proceedingJoinPoint){
        Object[] args = proceedingJoinPoint.getArgs();
        try{
            System.out.println("============================");
            System.out.println("前置——记录日志");
            proceedingJoinPoint.proceed();
            System.out.println("后置——记录日志");
        }catch(Throwable throwable){
            System.out.println("异常——记录日志");
            throwable.printStackTrace();
        }finally{
            System.out.println("最终通牒——记录日志");
        }
    }


}
