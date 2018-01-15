/*
 * CloudStream Service API
 * 实时流计算服（CloudStream Service，简称CS），是运行在华为云上的实时流式大数据分析服务，完全托管的方式让用户无需感知计算集群，只需聚焦于Stream SQL业务，即时执行作业，完全兼容Apache Flink API。
 *
 * OpenAPI spec version: 1.0.0
 * Contact: CloudStream@huawei.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huaweicloud.cs.java.v1;

import com.huaweicloud.cs.java.v1.client.ApiException;
import com.huaweicloud.cs.java.v1.model.GlobalErrorResponse;
import com.huaweicloud.cs.java.v1.model.GlobalResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthorizeApi
 */
@Ignore
public class AuthorizeApiTest {

    private final AuthorizeApi api = new AuthorizeApi();

    
    /**
     * 用户主动授权起OBS桶的操作权限给CloudStream服务, 用于保存用户作业的checkpoint、作业的运行日志等
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void authorizeBucketTest() throws ApiException {
        String xProjectId = null;
        List<String> body = null;
        GlobalResponse response = api.authorizeBucket(xProjectId, body);

        // TODO: test validations
    }
    
}