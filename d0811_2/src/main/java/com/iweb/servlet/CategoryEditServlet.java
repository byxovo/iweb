package com.iweb.servlet;

import com.iweb.dao.impl.CategoryDAOImpl;
import com.iweb.pojo.Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Byx
 * @Date: 2022/8/11 19:34
 * @description 类的描述介绍
 */
@WebServlet({"/editCategory"})
public class CategoryEditServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int sid = Integer.parseInt(req.getParameter("id"));
        Category category=new CategoryDAOImpl().get(sid);
        req.setAttribute("category",category);
        req.getRequestDispatcher("page/category/editCategory.jsp").forward(req,resp);
    }
}
