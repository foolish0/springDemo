package com.example.demo.democode.interceptor;

import com.example.demo.democode.service.StudentService;
import com.example.demo.democode.service.impl.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Component
public class MyInterceptor implements HandlerInterceptor {
    @Autowired
    private StudentService studentService;
    @Autowired
    private SendMessage sendMessage;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        doThings();
        sendMessage.report();
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }

    private void doThings() {
        String sno = "1002";
        Map<String, Object> student = studentService.queryStudentBysno(sno);
        System.out.println(student.values());
        int result = 10;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
