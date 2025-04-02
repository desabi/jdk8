package util.generator.person;

import java.time.LocalDate;

// instagram, twitter, facebook, linkedin
public class SocialNetwork {
  private String name; // name of the social network
  private String username;
  private int followers;
  private boolean active;
  private LocalDate createdAt;
  // constructor, getters, setters and toString method

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getFollowers() {
    return followers;
  }

  public void setFollowers(int followers) {
    this.followers = followers;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "SocialNetwork{" +
        "name='" + name + '\'' +
        ", username='" + username + '\'' +
        ", followers=" + followers +
        ", active=" + active +
        ", createdAt=" + createdAt +
        '}';
  }
}
