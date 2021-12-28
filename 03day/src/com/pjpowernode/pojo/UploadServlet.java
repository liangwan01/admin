package com.pjpowernode.pojo;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UploadServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        if (ServletFileUpload.isMultipartContent(req)) {

            FileItemFactory    fileItemFactory = new DiskFileItemFactory();

            ServletFileUpload   servletFileUpload = new ServletFileUpload(fileItemFactory);

            try {
                List<FileItem>  list = servletFileUpload.parseRequest(req);

                for (FileItem fileItem : list) {
                    if(fileItem.isFormField()){
                        System.out.println("表单的Name属性值为:" + fileItem.getFieldName());
                        System.out.println("表单的Value属性值为:" + fileItem.getString("utf-8"));

                    }else{
                        System.out.println("表单的Name属性为:" + fileItem.getFieldName());
                        System.out.println("上传的文件名称 : " + fileItem.getName());
                        fileItem.write(new File("E:\\" + fileItem.getName()));
                    }

                }
            } catch (FileUploadException e) {


            } catch (Exception e) {
                e.printStackTrace();
            }
        }








/*        if (ServletFileUpload.isMultipartContent(req)) {
// 创建 FileItemFactory 工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
// 创建用于解析上传数据的工具类 ServletFileUpload 类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            try {
// 解析上传的数据，得到每一个表单项 FileItem
                List<FileItem> list = servletFileUpload.parseRequest(req);
// 循环判断，每一个表单项，是普通类型，还是上传的文件
                for (FileItem fileItem : list) {
                    if (fileItem.isFormField()) {
// 普通表单项
                        System.out.println("表单项的 name 属性值：" + fileItem.getFieldName());
// 参数 UTF-8.解决乱码问题
                        System.out.println("表单项的 value 属性值：" + fileItem.getString("UTF-8"));
                    } else {
// 上传的文件
                        System.out.println("表单项的 name 属性值：" + fileItem.getFieldName());
                        System.out.println("上传的文件名：" + fileItem.getName());
                        fileItem.write(new File("e:\\" + fileItem.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }

}
