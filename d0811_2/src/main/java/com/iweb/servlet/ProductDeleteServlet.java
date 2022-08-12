package com.iweb.servlet;

import com.iweb.dao.ProductDAO;
import com.iweb.dao.impl.ProductDAOImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Byx
 * @Date: 2022/8/12 13:53
 * @description 类的描述介绍
 */
@WebServlet(urlPatterns = {"/deleteProduct"})
public class ProductDeleteServlet extends HttpServlet {
    private static ProductDAO dao = new ProductDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pid = Integer.parseInt(req.getParameter("id"));
        int cid = dao.get(pid).getCid();
        dao.delete(pid);
        resp.sendRedirect("/listProduct?id="+cid);

    }
}
