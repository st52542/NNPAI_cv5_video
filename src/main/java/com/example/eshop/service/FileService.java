package com.example.eshop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    String upload(MultipartFile image);
}
