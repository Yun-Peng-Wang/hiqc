//package com.example.demo.Interceptor;
//
//import com.example.demo.entity.SysUserEntity;
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//public class LoginInterceptor  implements HandlerInterceptor{
//
//    @Override
//    public boolean preHandle (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
//        HttpSession session = httpServletRequest.getSession();
//        //获取登录时保存到session的用户信息
//        SysUserEntity user = (SysUserEntity) httpServletRequest.getSession().getAttribute("user");
//        if (user == null){
//            //拦截未登录请求,跳转到登录页面
//            httpServletRequest.getRequestDispatcher("/login").forward(httpServletRequest, httpServletResponse);
//            return false;
//        }
//
////        String contextPath=session.getServletContext().getContextPath();
////        String[] requireAuthPages = new String[]{
////                "index",
////        };
////
////        if(begingWith(page, requireAuthPages)){
//////            SysUserEntity user = (SysUserEntity) session.getAttribute("user");
////            if(user==null) {
////                httpServletResponse.sendRedirect("login");
////                return false;
////            }
////        }
//        return true;
//    }
//
////    private boolean begingWith(String page, String[] requiredAuthPages) {
////        boolean result = false;
////        for (String requiredAuthPage : requiredAuthPages) {
////            if(StringUtils.startsWith(page, requiredAuthPage)) {
////                result = true;
////                break;
////            }
////        }
////        return result;
////    }
//}
//
//
