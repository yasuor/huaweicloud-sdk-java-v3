package com.huaweicloud.sdk.dc.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dc.v3.model.VirtualGatewayDict;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateVirtualGatewayRequestBody
 */
public class UpdateVirtualGatewayRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtual_gateway")
    
    private VirtualGatewayDict virtualGateway = null;

    public UpdateVirtualGatewayRequestBody withVirtualGateway(VirtualGatewayDict virtualGateway) {
        this.virtualGateway = virtualGateway;
        return this;
    }

    public UpdateVirtualGatewayRequestBody withVirtualGateway(Consumer<VirtualGatewayDict> virtualGatewaySetter) {
        if(this.virtualGateway == null ){
            this.virtualGateway = new VirtualGatewayDict();
            virtualGatewaySetter.accept(this.virtualGateway);
        }
        
        return this;
    }


    /**
     * Get virtualGateway
     * @return virtualGateway
     */
    public VirtualGatewayDict getVirtualGateway() {
        return virtualGateway;
    }

    public void setVirtualGateway(VirtualGatewayDict virtualGateway) {
        this.virtualGateway = virtualGateway;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVirtualGatewayRequestBody updateVirtualGatewayRequestBody = (UpdateVirtualGatewayRequestBody) o;
        return Objects.equals(this.virtualGateway, updateVirtualGatewayRequestBody.virtualGateway);
    }
    @Override
    public int hashCode() {
        return Objects.hash(virtualGateway);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirtualGatewayRequestBody {\n");
        sb.append("    virtualGateway: ").append(toIndentedString(virtualGateway)).append("\n");
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

