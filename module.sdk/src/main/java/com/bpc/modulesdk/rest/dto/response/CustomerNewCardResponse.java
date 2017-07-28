package com.bpc.modulesdk.rest.dto.response;

import com.bpc.modulesdk.rest.dto.pojo.entries.AccountTypeEntry;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Siarhei Mikevich on 4/26/17.
 */

public class CustomerNewCardResponse extends MainResponse {
    private String transRef;
    private RequiredData dataRequest;

    public String getTransRef() {
        return transRef;
    }

    public void setTransRef(String transRef) {
        this.transRef = transRef;
    }

    public RequiredData getDataRequest() {
        return dataRequest;
    }

    public void setDataRequest(RequiredData dataRequest) {
        this.dataRequest = dataRequest;
    }

    public static class RequiredData implements Serializable {

        private boolean newCardRequired;
        private List<AccountTypeEntry> selectAccountType;
        private boolean subagentAllowed;

        public boolean isNewCardRequired() {
            return newCardRequired;
        }

        public void setNewCardRequired(boolean newCardRequired) {
            this.newCardRequired = newCardRequired;
        }

        public List<AccountTypeEntry> getSelectAccountType() {
            return selectAccountType;
        }

        public void setSelectAccountType(List<AccountTypeEntry> selectAccountType) {
            this.selectAccountType = selectAccountType;
        }

        public boolean isSubagentAllowed() {
            return subagentAllowed;
        }

        public void setSubagentAllowed(boolean subagentAllowed) {
            this.subagentAllowed = subagentAllowed;
        }

    }

}
