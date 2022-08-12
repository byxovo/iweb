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
import java.util.List;

/**默认查询所有分类的数据 并将数据显示到ListCategory.jsp
 * @author Byx
 * @Date: 2022/8/11 16:25
 *
 */
@WebServlet(urlPatterns = {"/listCategory"})
public class CategoryListServvlet extends HttpServlet {
    private  static CategoryDAO dao=new CategoryDAOImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        获取对应的分类集合
        List<Category> categories=dao.list();
//        将集合存入到请求
        req.setAttribute("categories",categories);
//        利用转发进行页面跳转
        req.getRequestDispatcher("page/category/listCategory.jsp").forward(req,resp);

    }
}
