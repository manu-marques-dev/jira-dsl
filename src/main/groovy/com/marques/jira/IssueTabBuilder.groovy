package com.marques.jira

class IssueTabBuilder {
    static IssueTabSpec issueTab(@DelegatesTo(strategy = Closure.DELEGATE_ONLY, value = IssueTabSpec) Closure closure) {
        def issueTab = new IssueTabSpec()
        def code = closure.rehydrate(issueTab, issueTab, issueTab)
        code.resolveStrategy = Closure.DELEGATE_ONLY
        code()
        print(issueTab)
        issueTab
    }
}
