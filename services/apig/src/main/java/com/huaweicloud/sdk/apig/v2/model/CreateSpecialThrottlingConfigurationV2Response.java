package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSpecialThrottlingConfigurationV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="call_limits")
    
    private Integer callLimits;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_name")
    
    private String objectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_id")
    
    private Integer objectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="strategy_id")
    
    private String strategyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apply_time")
    
    private OffsetDateTime applyTime = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_type")
    
    private Integer objectType;

    public CreateSpecialThrottlingConfigurationV2Response withCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
        return this;
    }

    


    /**
     * 特殊对象在流控时间内能够访问API的最大次数限制
     * @return callLimits
     */
    public Integer getCallLimits() {
        return callLimits;
    }

    public void setCallLimits(Integer callLimits) {
        this.callLimits = callLimits;
    }

    public CreateSpecialThrottlingConfigurationV2Response withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 作用的APP名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CreateSpecialThrottlingConfigurationV2Response withObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }

    


    /**
     * 作用的APP或租户的名称
     * @return objectName
     */
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public CreateSpecialThrottlingConfigurationV2Response withObjectId(Integer objectId) {
        this.objectId = objectId;
        return this;
    }

    


    /**
     * 特殊对象的身份标识
     * @return objectId
     */
    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public CreateSpecialThrottlingConfigurationV2Response withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    


    /**
     * 流控策略编号
     * @return strategyId
     */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public CreateSpecialThrottlingConfigurationV2Response withApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    


    /**
     * 设置时间
     * @return applyTime
     */
    public OffsetDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(OffsetDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public CreateSpecialThrottlingConfigurationV2Response withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 特殊配置的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSpecialThrottlingConfigurationV2Response withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 作用的APP编号
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public CreateSpecialThrottlingConfigurationV2Response withObjectType(Integer objectType) {
        this.objectType = objectType;
        return this;
    }

    


    /**
     * 特殊对象类型：APP、USER
     * @return objectType
     */
    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSpecialThrottlingConfigurationV2Response createSpecialThrottlingConfigurationV2Response = (CreateSpecialThrottlingConfigurationV2Response) o;
        return Objects.equals(this.callLimits, createSpecialThrottlingConfigurationV2Response.callLimits) &&
            Objects.equals(this.appName, createSpecialThrottlingConfigurationV2Response.appName) &&
            Objects.equals(this.objectName, createSpecialThrottlingConfigurationV2Response.objectName) &&
            Objects.equals(this.objectId, createSpecialThrottlingConfigurationV2Response.objectId) &&
            Objects.equals(this.strategyId, createSpecialThrottlingConfigurationV2Response.strategyId) &&
            Objects.equals(this.applyTime, createSpecialThrottlingConfigurationV2Response.applyTime) &&
            Objects.equals(this.id, createSpecialThrottlingConfigurationV2Response.id) &&
            Objects.equals(this.appId, createSpecialThrottlingConfigurationV2Response.appId) &&
            Objects.equals(this.objectType, createSpecialThrottlingConfigurationV2Response.objectType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(callLimits, appName, objectName, objectId, strategyId, applyTime, id, appId, objectType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpecialThrottlingConfigurationV2Response {\n");
        sb.append("    callLimits: ").append(toIndentedString(callLimits)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
        sb.append("    applyTime: ").append(toIndentedString(applyTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

