package com.iweb.servlet;

import com.iweb.dao.ProductDAO;
import com.iweb.dao.impl.ProductDAOImpl;
import com.iweb.pojo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Byx
 * @Date: 2022/8/12 14:22
 * @description 类的描述介绍
 */
@WebServlet(urlPatterns = {"/editProduct"})
public class ProductEditServlet extends HttpServlet {
    private static ProductDAO dao = new ProductDAOImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pid=Integer.parseInt(req.getParameter("id"));
        Product p=dao.get(pid);
        req.setAttribute("p",p);
        req.getRequestDispatcher("page/product/editProduct.jsp").forward(req,resp);

    }
}
