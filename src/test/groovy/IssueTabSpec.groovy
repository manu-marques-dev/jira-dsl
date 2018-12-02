import static com.marques.jira.IssueTabBuilder.issueTab
import spock.lang.Specification


class IssueTabSpec extends Specification {

    void "test create issue tab using DSL" () {
        when:
            def issueTabCreated =
                issueTab {
                    order 1
                    name "Ejemplo"
                    withFields "Summary", "Description"
                }
        then:
            issueTabCreated.name == "Ejemplo"
            issueTabCreated.order == 1
            issueTabCreated.fields.size() == 2
    }

}
