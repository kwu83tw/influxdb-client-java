/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.influxdb.client.domain.HTTPNotificationRule;
import com.influxdb.client.domain.Label;
import com.influxdb.client.domain.PagerDutyNotificationRule;
import com.influxdb.client.domain.SMTPNotificationRule;
import com.influxdb.client.domain.SlackNotificationRule;
import com.influxdb.client.domain.StatusRule;
import com.influxdb.client.domain.TagRule;
import com.influxdb.client.domain.TaskStatusType;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * NotificationRule
 */

public class NotificationRule {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRule {\n");
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

