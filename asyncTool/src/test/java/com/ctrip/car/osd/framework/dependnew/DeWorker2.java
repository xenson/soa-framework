package com.ctrip.car.osd.framework.dependnew;

import com.ctrip.car.osd.framework.async.callback.ICallback;
import com.ctrip.car.osd.framework.async.callback.IWorker;
import com.ctrip.car.osd.framework.async.worker.WorkResult;
import com.ctrip.car.osd.framework.async.wrapper.WorkerWrapper;

import java.util.Map;

public class DeWorker2 implements IWorker<User, String>, ICallback<User, String> {

    @Override
    public String action(User requestParam, Map<String, WorkerWrapper> allWrappers) {
        System.out.println("-----------------");
        System.out.println("par1的执行结果是： " + allWrappers.get("second").getWorkResult());
        System.out.println("取par1的结果作为自己的入参，并将par1的结果加上一些东西");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user1 = (User) allWrappers.get("second").getWorkResult().getResult();
        return user1.getName() + " worker2 add";
    }

    @Override
    public String defaultValue() {
        return "default";
    }

    @Override
    public void begin() {
        //System.out.println(Thread.currentThread().getName() + "- start --" + System.currentTimeMillis());
    }

    @Override
    public void result(boolean success, User requestParam, WorkResult<String> workResult) {
        System.out.println("worker2 的结果是：" + workResult.getResult());
    }

}
