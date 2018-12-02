package com.marques.jira

class IssueTabSpec {

    Integer order

    String name

    List<String> fields

    IssueTabSpec name (String name) {
        this.name = name
        this
    }

    IssueTabSpec order (Integer order) {
        this.order = order
        this
    }


    IssueTabSpec withFields(List<String> fields){
        withFields(fields as String[])
    }

    IssueTabSpec withFields(String[] fields){
        this.fields = fields
        this
    }

}
