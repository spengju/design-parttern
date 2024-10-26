package com.peng.pattern.chainOfResponsibility;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/10/26 16:29
 * @Desc:
 */
public class Request {
    private boolean loggedOn;
    private boolean frequentOk;
    private boolean isPermit;
    private boolean containsSensitiveWords;
    private String requestBody;

    public Request(boolean loggedOn, boolean frequentOk, boolean isPermit, boolean containsSensitiveWords) {
        this.loggedOn = loggedOn;
        this.frequentOk = frequentOk;
        this.isPermit = isPermit;
        this.containsSensitiveWords = containsSensitiveWords;
    }

    public Request() {
    }

    static class RequestBuilder {
        private boolean loggedOn;
        private boolean frequentOk;
        private boolean isPermit;
        private boolean containsSensitiveWords;
        private String requestBody;

        public RequestBuilder loggedOn(boolean loggedOn) {
            this.loggedOn = loggedOn;
            return this;
        }

        public RequestBuilder frequentOk(boolean frequentOk) {
            this.frequentOk = frequentOk;
            return this;
        }

        public RequestBuilder isPermit(boolean isPermit) {
            this.isPermit = isPermit;
            return this;
        }

        public RequestBuilder containsSensitiveWords(boolean containsSensitiveWords) {
            this.containsSensitiveWords = containsSensitiveWords;
            return this;
        }

        public RequestBuilder requestBody(String requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        Request build() {
            return new Request(loggedOn, frequentOk, isPermit, containsSensitiveWords);
        }
    }

    public boolean isLoggedOn() {
        return loggedOn;
    }

    public void setLoggedOn(boolean loggedOn) {
        this.loggedOn = loggedOn;
    }

    public boolean isFrequentOk() {
        return frequentOk;
    }

    public void setFrequentOk(boolean frequentOk) {
        this.frequentOk = frequentOk;
    }

    public boolean isPermit() {
        return isPermit;
    }

    public void setPermit(boolean permit) {
        isPermit = permit;
    }

    public boolean isContainsSensitiveWords() {
        return containsSensitiveWords;
    }

    public void setContainsSensitiveWords(boolean containsSensitiveWords) {
        this.containsSensitiveWords = containsSensitiveWords;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }
}
