package model;

import com.google.common.base.MoreObjects;

public class DownstreamHttpNotificationIos extends DownstreamHttpNotificationImpl {

  // Optional
  private final String title;
  private final String badge;

  public String getTitle() {
    return title;
  }

  public String getBadge() {
    return badge;
  }

  public abstract static class Builder<T extends DownstreamHttpNotificationIos>
      extends DownstreamHttpNotificationImpl.Builder<T> {

    private String title;
    private String badge;

    public Builder<T> setTitle(String title) {
      this.title = title;
      return this;
    }

    public Builder<T> setBadge(String badge) {
      this.badge = badge;
      return this;
    }
  }

  public static Builder<?> builder() {
    return new Builder<DownstreamHttpNotificationIos>() {
      @Override
      public DownstreamHttpNotificationIos build() {
        return new DownstreamHttpNotificationIos(this);
      }
    };
  }

  protected DownstreamHttpNotificationIos(Builder<?> builder) {
    super(builder);
    this.title = builder.title;
    this.badge = builder.badge;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("title", title).add("badge", badge).toString();
  }
}
