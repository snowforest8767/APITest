package com.cheyipai.test.api.environment;


import com.cheyipai.test.api.annotation.SetUp;
import com.cheyipai.test.api.annotation.TearDown;
import com.cheyipai.test.api.verify.DBVerifyHelper;

public class SamplesEnvManager extends EnvManager {

    @SetUp(description = "延迟[millis]毫秒")
    public void delay(String millis) throws Exception {
        Thread.sleep(Long.valueOf(millis) );
    }

    @SetUp(description = "执行测试状态修改")
    public void changeTestStep() throws Exception {
        DBVerifyHelper.updateDB("change_step");
    }

    @TearDown
    public void revertTestStep() throws Exception {
        DBVerifyHelper.updateDB("revert_step");
    }
}
