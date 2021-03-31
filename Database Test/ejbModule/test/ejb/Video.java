package test.ejb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Video")
public class Video {
	private String title;
	private int videoNo;
	private VideoId videoId;
	private int duration;
	private String videoURL;
	
	@Column(name="title", nullable = false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="videoNo", insertable = false, nullable = false)
	public int getVideoNo() {
		return videoNo;
	}
	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="videoId", insertable = false, nullable = false)
	public VideoId getVideoId() {
		return videoId;
	}
	public void setVideoId(VideoId videoId) {
		this.videoId = videoId;
	}
	
	@Column(name="duration")
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	@Column(name="videoURL")
	public String getVideoURL() {
		return videoURL;
	}
	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}
	

}
