package com.demo.app;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.Test;

import java.util.Collections;

/**
 * @author xg BLACK
 * @date 2022/6/23 18:56
 * description: 代码生成
 */
public class MPTool {


    /**
     * MySQL数据表代码生成
     */
    @Test
    public void mysqlGen(){
        //数据库连接
        String url = "jdbc:mysql://127.0.0.1:3306/bootdemo?useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&transformedBitIsBoolean=true&serverTimezone=GMT%2B8&nullCatalogMeansCurrent=true&allowPublicKeyRetrieval=true";
        //数据用户名
        String username = "root";
        //数据库密码
        String password = "admin";

        FastAutoGenerator.create(url,username,password)
                .globalConfig(builder -> {
                    builder.author("xgblack") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir()
                            .outputDir("E:\\Codes\\project_xg\\bootdemo\\src\\main\\java\\"); // 指定输出目录（代码文件输出目录）
                })
                .packageConfig(builder -> {
                    builder.parent("com.demo") // 设置父包名
                            .moduleName("app") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\Codes\\project_xg\\bootdemo\\src\\main\\resources\\mapper\\")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("student") // 设置需要生成的表名
                            //.addTablePrefix() // 设置过滤表前缀
                            .entityBuilder()
                            .enableLombok() // 开启lombok
                            .enableChainModel(); // 开启链式模式
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }


    /**
     * PG 数据表代码生成
     */
    @Test
    public void pgGen(){
        //数据库连接
        String url = "jdbc:postgresql://127.0.0.1:5432/bootdemopg";
        //数据用户名
        String username = "postgres";
        //数据库密码
        String password = "admin";
        //模式名
        String schemaName = "animal";

        FastAutoGenerator.create(new DataSourceConfig.Builder(url, username, password).schema(schemaName))
                .globalConfig(builder -> {
                    builder.author("xgblack") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir()
                            .outputDir("E:\\Codes\\project_xg\\bootdemo\\src\\main\\java\\"); // 指定输出目录（代码文件输出目录）
                })
                .packageConfig(builder -> {
                    builder.parent("com.demo") // 设置父包名
                            .moduleName("app") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\Codes\\project_xg\\bootdemo\\src\\main\\resources\\mapper\\")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("dog") // 设置需要生成的表名
                            .enableSchema() // 开启schema模式
                            .addTablePrefix() // 设置过滤表前缀
                            .entityBuilder()
                            .enableLombok()
                            .enableChainModel();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
