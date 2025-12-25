package generators.department;

import java.util.List;
import java.util.stream.Collectors;

public class ResearchTeam {
    private String leadName;
    private List<String> memberNames;

    public ResearchTeam(String leadName, List<String> memberNames) {
        this.leadName = leadName;
        this.memberNames = memberNames;
    }

    public String getLeadName() { return leadName; }
    public List<String> getMemberNames() { return memberNames; }

    @Override
    public String toString() {
        String membersJson = memberNames.stream()
            .map(name -> "\"" + name + "\"")
            .collect(Collectors.joining(", ", "[", "]"));

        return String.format(
            "{\"leadName\": \"%s\", \"memberNames\": %s}",
            leadName, membersJson
        );
    }

}