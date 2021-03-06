package com.huaweicloud.sdk.devstar.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.devstar.v1.model.*;

public class DevstarAsyncClient {
    protected HcClient hcClient;

    public DevstarAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DevstarAsyncClient> newBuilder() {
        return new ClientBuilder<>(DevstarAsyncClient::new);
    }


    public CompletableFuture<RunTemplateJobV2Response> runTemplateJobV2Async(RunTemplateJobV2Request request) {
        return hcClient.asyncInvokeHttp(request, DevstarMeta.runTemplateJobV2);
    }

    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevstarMeta.showJobDetail);
    }

    public CompletableFuture<ListPublishedTemplatesResponse> listPublishedTemplatesAsync(ListPublishedTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DevstarMeta.listPublishedTemplates);
    }

    public CompletableFuture<ShowTemplateDetailResponse> showTemplateDetailAsync(ShowTemplateDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DevstarMeta.showTemplateDetail);
    }

}