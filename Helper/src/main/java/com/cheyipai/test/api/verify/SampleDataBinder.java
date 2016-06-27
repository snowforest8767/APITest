package com.cheyipai.test.api.verify;
import com.cheyipai.test.api.parameter.*;
import com.cheyipai.test.utils.Logger;

public class SampleDataBinder extends IDataBinder {

    @Override
    public String bind(String src) {
        return src.equals("SampleDataBinderValue") ? "ReplacedBySampleDataBinder" : src;
    }
}
