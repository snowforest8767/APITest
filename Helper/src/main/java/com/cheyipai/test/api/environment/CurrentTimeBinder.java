package com.cheyipai.test.api.environment;

import com.cheyipai.test.api.parameter.IDataBinder;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lizonglin on 2016/3/18/0018.
 */
public class CurrentTimeBinder extends IDataBinder {
    private final Pattern p = Pattern.compile("\\$\\{currentTime?\\}");
    private final long currentTime = System.currentTimeMillis();
    @Override
    public String bind(String v) {
        Matcher matcher = p.matcher(v);
        while (matcher.find()) {
            String target = matcher.group(0);
            v = v.replace(target, String.valueOf(currentTime));
        }
        return v;
    }

    @Test
    public void test() {
        System.out.println(bind("${currentTime}"));
    }
}
