/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.DeprecatedObject;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ObjectWithDeprecatedFields
 */
@JsonPropertyOrder({
  ObjectWithDeprecatedFields.JSON_PROPERTY_UUID,
  ObjectWithDeprecatedFields.JSON_PROPERTY_ID,
  ObjectWithDeprecatedFields.JSON_PROPERTY_DEPRECATED_REF,
  ObjectWithDeprecatedFields.JSON_PROPERTY_BARS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.15.0-SNAPSHOT")
public class ObjectWithDeprecatedFields {
  public static final String JSON_PROPERTY_UUID = "uuid";
  @javax.annotation.Nullable
  private String uuid;

  public static final String JSON_PROPERTY_ID = "id";
  @Deprecated
  @javax.annotation.Nullable
  private BigDecimal id;

  public static final String JSON_PROPERTY_DEPRECATED_REF = "deprecatedRef";
  @Deprecated
  @javax.annotation.Nullable
  private DeprecatedObject deprecatedRef;

  public static final String JSON_PROPERTY_BARS = "bars";
  @Deprecated
  @javax.annotation.Nullable
  private List<String> bars = new ArrayList<>();

  public ObjectWithDeprecatedFields() { 
  }

  public ObjectWithDeprecatedFields uuid(@javax.annotation.Nullable String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUuid() {
    return uuid;
  }


  @JsonProperty(JSON_PROPERTY_UUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUuid(@javax.annotation.Nullable String uuid) {
    this.uuid = uuid;
  }


  @Deprecated
  public ObjectWithDeprecatedFields id(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable BigDecimal id) {
    this.id = id;
  }


  @Deprecated
  public ObjectWithDeprecatedFields deprecatedRef(@javax.annotation.Nullable DeprecatedObject deprecatedRef) {
    this.deprecatedRef = deprecatedRef;
    return this;
  }

  /**
   * Get deprecatedRef
   * @return deprecatedRef
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPRECATED_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeprecatedObject getDeprecatedRef() {
    return deprecatedRef;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_DEPRECATED_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeprecatedRef(@javax.annotation.Nullable DeprecatedObject deprecatedRef) {
    this.deprecatedRef = deprecatedRef;
  }


  @Deprecated
  public ObjectWithDeprecatedFields bars(@javax.annotation.Nullable List<String> bars) {
    this.bars = bars;
    return this;
  }

  public ObjectWithDeprecatedFields addBarsItem(String barsItem) {
    if (this.bars == null) {
      this.bars = new ArrayList<>();
    }
    this.bars.add(barsItem);
    return this;
  }

  /**
   * Get bars
   * @return bars
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getBars() {
    return bars;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_BARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBars(@javax.annotation.Nullable List<String> bars) {
    this.bars = bars;
  }


  /**
   * Return true if this ObjectWithDeprecatedFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o, false, null, true);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWithDeprecatedFields {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    deprecatedRef: ").append(toIndentedString(deprecatedRef)).append("\n");
    sb.append("    bars: ").append(toIndentedString(bars)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

