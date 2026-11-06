package me.ahnwoohyun.springbootdeveloper.service;

import me.ahnwoohyun.springbootdeveloper.dto.UploadResponse;

public interface FileStorageService {
    UploadResponse store(byte[] bytes, String filename);
}
