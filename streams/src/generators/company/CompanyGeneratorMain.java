package generators.company;

import java.util.List;

public class CompanyGeneratorMain {

  public static void main(String[] args) {
    List<Company> companies = CompanyGenerator.generateCompanies();

    // challenges to solve on companies list
     // https://copilot.microsoft.com/chats/WLx2k2dPb4H7mLJyBYZjh
    companies.forEach(System.out::println);
  }

}
