package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class PrePaidServerSchedulerHints  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group")
    
    private String group;
    /**
     * 在指定的专属主机或者共享主机上创建弹性云服务器。参数值为shared或者dedicated。
     */
    public static class TenancyEnum {

        
        /**
         * Enum SHARED for value: "shared"
         */
        public static final TenancyEnum SHARED = new TenancyEnum("shared");
        
        /**
         * Enum DEDICATED for value: "dedicated"
         */
        public static final TenancyEnum DEDICATED = new TenancyEnum("dedicated");
        

        public static final Map<String, TenancyEnum> staticFields = new HashMap<String, TenancyEnum>() {
            { 
                put("shared", SHARED);
                put("dedicated", DEDICATED);
            }
        };

        private String value;

        TenancyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TenancyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TenancyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TenancyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TenancyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TenancyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TenancyEnum) {
                return this.value.equals(((TenancyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenancy")
    
    private TenancyEnum tenancy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_host_id")
    
    private String dedicatedHostId;

    public PrePaidServerSchedulerHints withGroup(String group) {
        this.group = group;
        return this;
    }

    


    /**
     * 云服务器组ID，UUID格式。
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public PrePaidServerSchedulerHints withTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    


    /**
     * 在指定的专属主机或者共享主机上创建弹性云服务器。参数值为shared或者dedicated。
     * @return tenancy
     */
    public TenancyEnum getTenancy() {
        return tenancy;
    }

    public void setTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
    }

    public PrePaidServerSchedulerHints withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    


    /**
     * 专属主机的ID。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrePaidServerSchedulerHints prePaidServerSchedulerHints = (PrePaidServerSchedulerHints) o;
        return Objects.equals(this.group, prePaidServerSchedulerHints.group) &&
            Objects.equals(this.tenancy, prePaidServerSchedulerHints.tenancy) &&
            Objects.equals(this.dedicatedHostId, prePaidServerSchedulerHints.dedicatedHostId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(group, tenancy, dedicatedHostId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrePaidServerSchedulerHints {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
        sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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

