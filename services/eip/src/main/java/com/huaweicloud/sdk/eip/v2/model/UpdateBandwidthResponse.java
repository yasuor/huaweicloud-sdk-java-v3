package com.huaweicloud.sdk.eip.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.BandwidthResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateBandwidthResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private BandwidthResp bandwidth = null;

    public UpdateBandwidthResponse withBandwidth(BandwidthResp bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public UpdateBandwidthResponse withBandwidth(Consumer<BandwidthResp> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new BandwidthResp();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthResp getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthResp bandwidth) {
        this.bandwidth = bandwidth;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateBandwidthResponse updateBandwidthResponse = (UpdateBandwidthResponse) o;
        return Objects.equals(this.bandwidth, updateBandwidthResponse.bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBandwidthResponse {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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

