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
 * @Date: 2022/8/12 14:39
 * @description 类的描述介绍
 */
@WebServlet(urlPatterns = {"/updateProduct"})
public class ProductUpdateServlet extends HttpServlet {
    private static ProductDAO dao = new ProductDAOImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.setCharacterEncoding("UTF-8");
        int pid=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        float price =Float.parseFloat(req.getParameter("price"));
        int stock=Integer.parseInt(req.getParameter("stock"));
        int cid=Integer.parseInt(req.getParameter("cid"));
        Product product=new Product();
        product.setName(name);
        product.setPrice(price);
        product.setStock(stock);
        product.setCid(cid);
        product.setId(pid);
        dao.update(product);
        resp.sendRedirect("/listProduct?id="+cid);

    }
}
