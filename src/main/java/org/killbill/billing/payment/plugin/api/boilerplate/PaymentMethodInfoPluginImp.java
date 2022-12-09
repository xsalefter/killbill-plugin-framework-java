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

package org.killbill.billing.payment.plugin.api.boilerplate;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import org.killbill.billing.payment.plugin.api.PaymentMethodInfoPlugin;

@JsonDeserialize( builder = PaymentMethodInfoPluginImp.Builder.class )
public class PaymentMethodInfoPluginImp implements PaymentMethodInfoPlugin {

    protected UUID accountId;
    protected String externalPaymentMethodId;
    protected boolean isDefault;
    protected UUID paymentMethodId;

    public PaymentMethodInfoPluginImp(final PaymentMethodInfoPluginImp that) {
        this.accountId = that.accountId;
        this.externalPaymentMethodId = that.externalPaymentMethodId;
        this.isDefault = that.isDefault;
        this.paymentMethodId = that.paymentMethodId;
    }
    protected PaymentMethodInfoPluginImp(final PaymentMethodInfoPluginImp.Builder<?> builder) {
        this.accountId = builder.accountId;
        this.externalPaymentMethodId = builder.externalPaymentMethodId;
        this.isDefault = builder.isDefault;
        this.paymentMethodId = builder.paymentMethodId;
    }
    protected PaymentMethodInfoPluginImp() { }
    @Override
    public UUID getAccountId() {
        return this.accountId;
    }
    @Override
    public String getExternalPaymentMethodId() {
        return this.externalPaymentMethodId;
    }
    @Override
    @JsonGetter("isDefault")
    public boolean isDefault() {
        return this.isDefault;
    }
    @Override
    public UUID getPaymentMethodId() {
        return this.paymentMethodId;
    }
    @Override
    public boolean equals(final Object o) {
        if ( this == o ) {
            return true;
        }
        if ( ( o == null ) || ( this.getClass() != o.getClass() ) ) {
            return false;
        }
        final PaymentMethodInfoPluginImp that = (PaymentMethodInfoPluginImp) o;
        if( !Objects.equals(this.accountId, that.accountId) ) {
            return false;
        }
        if( !Objects.equals(this.externalPaymentMethodId, that.externalPaymentMethodId) ) {
            return false;
        }
        if( this.isDefault != that.isDefault ) {
            return false;
        }
        if( !Objects.equals(this.paymentMethodId, that.paymentMethodId) ) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = ( 31 * result ) + Objects.hashCode(this.accountId);
        result = ( 31 * result ) + Objects.hashCode(this.externalPaymentMethodId);
        result = ( 31 * result ) + Objects.hashCode(this.isDefault);
        result = ( 31 * result ) + Objects.hashCode(this.paymentMethodId);
        return result;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("accountId=").append(this.accountId);
        sb.append(", ");
        sb.append("externalPaymentMethodId=");
        if( this.externalPaymentMethodId == null ) {
            sb.append(this.externalPaymentMethodId);
        }else{
            sb.append("'").append(this.externalPaymentMethodId).append("'");
        }
        sb.append(", ");
        sb.append("isDefault=").append(this.isDefault);
        sb.append(", ");
        sb.append("paymentMethodId=").append(this.paymentMethodId);
        sb.append("}");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public static class Builder<T extends PaymentMethodInfoPluginImp.Builder<T>> {

        protected UUID accountId;
        protected String externalPaymentMethodId;
        protected boolean isDefault;
        protected UUID paymentMethodId;

        public Builder() { }
        public Builder(final Builder that) {
            this.accountId = that.accountId;
            this.externalPaymentMethodId = that.externalPaymentMethodId;
            this.isDefault = that.isDefault;
            this.paymentMethodId = that.paymentMethodId;
        }
        public T withAccountId(final UUID accountId) {
            this.accountId = accountId;
            return (T) this;
        }
        public T withExternalPaymentMethodId(final String externalPaymentMethodId) {
            this.externalPaymentMethodId = externalPaymentMethodId;
            return (T) this;
        }
        public T withIsDefault(final boolean isDefault) {
            this.isDefault = isDefault;
            return (T) this;
        }
        public T withPaymentMethodId(final UUID paymentMethodId) {
            this.paymentMethodId = paymentMethodId;
            return (T) this;
        }
        public T source(final PaymentMethodInfoPlugin that) {
            this.accountId = that.getAccountId();
            this.externalPaymentMethodId = that.getExternalPaymentMethodId();
            this.isDefault = that.isDefault();
            this.paymentMethodId = that.getPaymentMethodId();
            return (T) this;
        }
        protected Builder validate() {
          return this;
        }
        public PaymentMethodInfoPluginImp build() {
            return new PaymentMethodInfoPluginImp(this.validate());
        }
    }
}
