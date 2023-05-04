/*
 *  Generated by https://github.com/killbill/api-pojos. Do not edit!
 *
 *  Copyright 2022-2022 The Billing Project, LLC
 *
 *  The Billing Project licenses this file to you under the Apache License,
 *  version 2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

package org.killbill.billing.notification.plugin.api.boilerplate.plugin;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import org.killbill.billing.ObjectType;
import org.killbill.billing.notification.plugin.api.ExtBusEvent;
import org.killbill.billing.notification.plugin.api.ExtBusEventType;

@JsonDeserialize( builder = ExtBusEventImp.Builder.class )
public class ExtBusEventImp implements ExtBusEvent {

    protected UUID accountId;
    protected ExtBusEventType eventType;
    protected String metaData;
    protected UUID objectId;
    protected ObjectType objectType;
    protected UUID tenantId;
    protected UUID userToken;

    public ExtBusEventImp(final ExtBusEventImp that) {
        this.accountId = that.accountId;
        this.eventType = that.eventType;
        this.metaData = that.metaData;
        this.objectId = that.objectId;
        this.objectType = that.objectType;
        this.tenantId = that.tenantId;
        this.userToken = that.userToken;
    }
    protected ExtBusEventImp(final ExtBusEventImp.Builder<?> builder) {
        this.accountId = builder.accountId;
        this.eventType = builder.eventType;
        this.metaData = builder.metaData;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.tenantId = builder.tenantId;
        this.userToken = builder.userToken;
    }
    protected ExtBusEventImp() { }
    @Override
    public UUID getAccountId() {
        return this.accountId;
    }
    @Override
    public ExtBusEventType getEventType() {
        return this.eventType;
    }
    @Override
    public String getMetaData() {
        return this.metaData;
    }
    @Override
    public UUID getObjectId() {
        return this.objectId;
    }
    @Override
    public ObjectType getObjectType() {
        return this.objectType;
    }
    @Override
    public UUID getTenantId() {
        return this.tenantId;
    }
    @Override
    public UUID getUserToken() {
        return this.userToken;
    }
    @Override
    public boolean equals(final Object o) {
        if ( this == o ) {
            return true;
        }
        if ( ( o == null ) || ( this.getClass() != o.getClass() ) ) {
            return false;
        }
        final ExtBusEventImp that = (ExtBusEventImp) o;
        if( !Objects.equals(this.accountId, that.accountId) ) {
            return false;
        }
        if( !Objects.equals(this.eventType, that.eventType) ) {
            return false;
        }
        if( !Objects.equals(this.metaData, that.metaData) ) {
            return false;
        }
        if( !Objects.equals(this.objectId, that.objectId) ) {
            return false;
        }
        if( !Objects.equals(this.objectType, that.objectType) ) {
            return false;
        }
        if( !Objects.equals(this.tenantId, that.tenantId) ) {
            return false;
        }
        if( !Objects.equals(this.userToken, that.userToken) ) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = ( 31 * result ) + Objects.hashCode(this.accountId);
        result = ( 31 * result ) + Objects.hashCode(this.eventType);
        result = ( 31 * result ) + Objects.hashCode(this.metaData);
        result = ( 31 * result ) + Objects.hashCode(this.objectId);
        result = ( 31 * result ) + Objects.hashCode(this.objectType);
        result = ( 31 * result ) + Objects.hashCode(this.tenantId);
        result = ( 31 * result ) + Objects.hashCode(this.userToken);
        return result;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("accountId=").append(this.accountId);
        sb.append(", ");
        sb.append("eventType=").append(this.eventType);
        sb.append(", ");
        sb.append("metaData=");
        if( this.metaData == null ) {
            sb.append(this.metaData);
        }else{
            sb.append("'").append(this.metaData).append("'");
        }
        sb.append(", ");
        sb.append("objectId=").append(this.objectId);
        sb.append(", ");
        sb.append("objectType=").append(this.objectType);
        sb.append(", ");
        sb.append("tenantId=").append(this.tenantId);
        sb.append(", ");
        sb.append("userToken=").append(this.userToken);
        sb.append("}");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public static class Builder<T extends ExtBusEventImp.Builder<T>> {

        protected UUID accountId;
        protected ExtBusEventType eventType;
        protected String metaData;
        protected UUID objectId;
        protected ObjectType objectType;
        protected UUID tenantId;
        protected UUID userToken;

        public Builder() { }
        public Builder(final Builder that) {
            this.accountId = that.accountId;
            this.eventType = that.eventType;
            this.metaData = that.metaData;
            this.objectId = that.objectId;
            this.objectType = that.objectType;
            this.tenantId = that.tenantId;
            this.userToken = that.userToken;
        }
        public T withAccountId(final UUID accountId) {
            this.accountId = accountId;
            return (T) this;
        }
        public T withEventType(final ExtBusEventType eventType) {
            this.eventType = eventType;
            return (T) this;
        }
        public T withMetaData(final String metaData) {
            this.metaData = metaData;
            return (T) this;
        }
        public T withObjectId(final UUID objectId) {
            this.objectId = objectId;
            return (T) this;
        }
        public T withObjectType(final ObjectType objectType) {
            this.objectType = objectType;
            return (T) this;
        }
        public T withTenantId(final UUID tenantId) {
            this.tenantId = tenantId;
            return (T) this;
        }
        public T withUserToken(final UUID userToken) {
            this.userToken = userToken;
            return (T) this;
        }
        public T source(final ExtBusEvent that) {
            this.accountId = that.getAccountId();
            this.eventType = that.getEventType();
            this.metaData = that.getMetaData();
            this.objectId = that.getObjectId();
            this.objectType = that.getObjectType();
            this.tenantId = that.getTenantId();
            this.userToken = that.getUserToken();
            return (T) this;
        }
        protected Builder validate() {
          return this;
        }
        public ExtBusEventImp build() {
            return new ExtBusEventImp(this.validate());
        }
    }
}
