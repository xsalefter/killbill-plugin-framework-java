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

package org.killbill.billing.invoice.plugin.api.boilerplate.plugin;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.Objects;
import org.killbill.billing.invoice.api.Invoice;
import org.killbill.billing.invoice.plugin.api.AdditionalItemsResult;
import org.killbill.billing.invoice.plugin.api.InvoiceContext;
import org.killbill.billing.invoice.plugin.api.InvoiceGroupingResult;
import org.killbill.billing.invoice.plugin.api.InvoicePluginApi;
import org.killbill.billing.invoice.plugin.api.OnFailureInvoiceResult;
import org.killbill.billing.invoice.plugin.api.OnSuccessInvoiceResult;
import org.killbill.billing.invoice.plugin.api.PriorInvoiceResult;
import org.killbill.billing.payment.api.PluginProperty;

@JsonDeserialize( builder = InvoicePluginApiImp.Builder.class )
public class InvoicePluginApiImp implements InvoicePluginApi {


    public InvoicePluginApiImp(final InvoicePluginApiImp that) {
    }
    protected InvoicePluginApiImp(final InvoicePluginApiImp.Builder<?> builder) {
    }
    protected InvoicePluginApiImp() { }
    @Override
    public OnFailureInvoiceResult onFailureCall(final InvoiceContext context, final Iterable<PluginProperty> properties) {
        throw new UnsupportedOperationException("onFailureCall(org.killbill.billing.invoice.plugin.api.InvoiceContext, java.lang.Iterable<org.killbill.billing.payment.api.PluginProperty>) must be implemented.");
    }
    @Override
    public InvoiceGroupingResult getInvoiceGrouping(final Invoice invoice, final boolean dryRun, final Iterable<PluginProperty> properties, final InvoiceContext context) {
        throw new UnsupportedOperationException("getInvoiceGrouping(org.killbill.billing.invoice.api.Invoice, boolean, java.lang.Iterable<org.killbill.billing.payment.api.PluginProperty>, org.killbill.billing.invoice.plugin.api.InvoiceContext) must be implemented.");
    }
    @Override
    public OnSuccessInvoiceResult onSuccessCall(final InvoiceContext context, final Iterable<PluginProperty> properties) {
        throw new UnsupportedOperationException("onSuccessCall(org.killbill.billing.invoice.plugin.api.InvoiceContext, java.lang.Iterable<org.killbill.billing.payment.api.PluginProperty>) must be implemented.");
    }
    @Override
    public PriorInvoiceResult priorCall(final InvoiceContext context, final Iterable<PluginProperty> properties) {
        throw new UnsupportedOperationException("priorCall(org.killbill.billing.invoice.plugin.api.InvoiceContext, java.lang.Iterable<org.killbill.billing.payment.api.PluginProperty>) must be implemented.");
    }
    @Override
    public AdditionalItemsResult getAdditionalInvoiceItems(final Invoice invoice, final boolean dryRun, final Iterable<PluginProperty> properties, final InvoiceContext context) {
        throw new UnsupportedOperationException("getAdditionalInvoiceItems(org.killbill.billing.invoice.api.Invoice, boolean, java.lang.Iterable<org.killbill.billing.payment.api.PluginProperty>, org.killbill.billing.invoice.plugin.api.InvoiceContext) must be implemented.");
    }
    @Override
    public boolean equals(final Object o) {
        if ( this == o ) {
            return true;
        }
        if ( ( o == null ) || ( this.getClass() != o.getClass() ) ) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int result = 1;
        return result;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public static class Builder<T extends InvoicePluginApiImp.Builder<T>> {


        public Builder() { }
        public Builder(final Builder that) {
        }
        public T source(final InvoicePluginApi that) {
            return (T) this;
        }
        protected Builder validate() {
          return this;
        }
        public InvoicePluginApiImp build() {
            return new InvoicePluginApiImp(this.validate());
        }
    }
}
