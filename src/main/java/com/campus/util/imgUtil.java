package com.campus.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * @Author: hyong
 * @Date: 2020/8/31 10:30 下午
 * @Description:
 */
public class imgUtil {
    public static void main(String[] args) throws IOException {
        //获取classpath绝对路径
        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        Thumbnails.of(new File("/Users/hyong/work/workimg/23.png"))
                .size(200,200).watermark(Positions.BOTTOM_RIGHT,
                ImageIO.read(new File(basePath + "watermark.jpg")),0.25f).outputQuality(0.8f)
                .toFile("/Users/hyong/work/workimg/23new.png");

    }
}
