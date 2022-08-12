package com.iweb.servlet;



import com.iweb.dao.CategoryDAO;
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
 * @Date: 2022/8/11 19:43
 * @description 类的描述介绍
 */
@WebServlet({"/updateCategory"})
public class CategoryUpdateServlet extends HttpServlet {
    private  static CategoryDAO dao=new CategoryDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        Category category=new Category(id,name);
        new CategoryDAOImpl().update(category);
        resp.sendRedirect("/listCategory");

    }
}
