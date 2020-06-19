package com.huaweicloud.sdk.iam.v3.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Config;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneShowSecurityComplianceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config")
    
    private Config config = null;

    public KeystoneShowSecurityComplianceResponse withConfig(Config config) {
        this.config = config;
        return this;
    }

    public KeystoneShowSecurityComplianceResponse withConfig(Consumer<Config> configSetter) {
        if(this.config == null ){
            this.config = new Config();
        }
        configSetter.accept(this.config);
        return this;
    }


    /**
     * Get config
     * @return config
     */
    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowSecurityComplianceResponse keystoneShowSecurityComplianceResponse = (KeystoneShowSecurityComplianceResponse) o;
        return Objects.equals(this.config, keystoneShowSecurityComplianceResponse.config);
    }
    @Override
    public int hashCode() {
        return Objects.hash(config);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowSecurityComplianceResponse {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
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
