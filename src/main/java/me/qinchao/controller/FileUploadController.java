package me.qinchao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by sulvto on 16-6-20.
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    private final String ROOT_DIR = "upload";

    @PostConstruct
    private void mkdir() {
        File file = new File(ROOT_DIR);
        if (!file.exists()) {
            file.mkdir();
        }
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    String upload(@RequestParam("file") MultipartFile file) {
        Path path = Paths.get(ROOT_DIR + File.separator + file.getOriginalFilename());
        try {
            Files.copy(file.getInputStream(), path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/file/list.html";
    }

    @RequestMapping("/upload.html")
    String uploadView() {
        return "fileUpload/uploadForm";
    }

    @RequestMapping("/list.html")
    String list(Model model) {
        model.addAttribute("fileList", new File(ROOT_DIR).list());
        return "fileUpload/list";
    }

}

