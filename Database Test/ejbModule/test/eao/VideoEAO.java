package test.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import test.ejb.Video;

/**
 * Session Bean implementation class VideoEAO
 */
@Stateless
public class VideoEAO implements VideoEAOLocal {

    @PersistenceContext(unitName="LabEJBSql")
	private EntityManager em;
    
    /**
     * Default constructor. 
     */
    public VideoEAO() {
        // TODO Auto-generated constructor stub
    }

    public Video findVideo(String videoId){
    	return em.find(Video.class, videoId);
    	}
    public Video createVideo(Video video) {
    	em.persist(video);
    	return video;
    	}
    public Video updateVideo(Video video) {
    	em.merge(video);
    	return video;
    	}
    public void deleteVideo(String videoId) {
    	Video video = this.findVideo(videoId);
    	if(video != null) {
    		em.remove(video);
    		}
    	}

}
