package com.baizhi.controller;

import org.h2.util.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("file")
public class FileController {
    @RequestMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpSession session) throws IOException {
        String realPath = session.getServletContext().getRealPath("/upload");
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File(realPath+"/"+file.getOriginalFilename()));
        return "上传成功";
    }
    @RequestMapping("jsp")
    public String jsp(){
        return "index";
    }
    @RequestMapping("download")
    public void download(String fileName, HttpServletResponse res,HttpSession session) throws IOException {
        String realPath = session.getServletContext().getRealPath("/upload");
        System.out.println(fileName);
        FileInputStream stream = new FileInputStream(new File(realPath + "/" + fileName));
        String mimeType = session.getServletContext().getMimeType(fileName.substring(fileName.lastIndexOf(".")));
        res.setContentType(mimeType);
        res.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        res.setCharacterEncoding("utf-8");
        IOUtils.copy(stream, res.getOutputStream());

    }
    }
