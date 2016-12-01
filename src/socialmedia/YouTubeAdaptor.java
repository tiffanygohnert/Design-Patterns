/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author whi08_000
 */
public class YouTubeAdaptor implements SocialMediaEntry {
  
  /**
   * The object we are delegating the interface methods to.
   */
  private final YouTubeVideo video;

  
  /**
   * Construct the adapter for a YouTubeVideo object.
   * @param video The video we are adapting
   */
  public YouTubeAdaptor(YouTubeVideo video) {
    this.video = video;
  }

  @Override
  public String getUser() {
    return video.getAuthor();
  }

  @Override
  public String getPostText() {
    return video.getTitle() + " " + video.getDescription();
  }
}