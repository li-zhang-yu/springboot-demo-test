package com.github.springbootdemotest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
public class HelloController {

    @RequestMapping("/demo")
    public String test() {
        System.out.println(123);
        return "hello world123";
    }

    @RequestMapping("/test")
    public void testShell() throws Exception {
        String returnCode = "";
        try {
            //Process process = Runtime.getRuntime().exec("src/main/shell/test.sh");
            //process.waitFor();
            // test2.sh是要执行的shell文件，param1参数值，test2.sh和param1之间要有空格
            // 多个参数可以在param1后面继续增加，但不要忘记空格！！
            Process process = Runtime.getRuntime().exec(new String[]{"src/main/shell/test.sh"});
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null;
            StringBuffer sb = new StringBuffer("");
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            System.out.println(sb.toString());
            returnCode = process.waitFor() + "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
