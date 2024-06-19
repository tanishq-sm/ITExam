
package hib.software.beans;

public class feedback
{
    private String feedbackId;
    private String feedbackType;

    private String description;

    public feedback() {
    }

    public feedback(String feedbackId, String feedbackType, String description) {
        this.feedbackId = feedbackId;
        this.feedbackType = feedbackType;
        this.description = description;
    }

    /**
     * @return the feedbackId
     */
    public String getFeedbackId() {
        return feedbackId;
    }

    /**
     * @param feedbackId the feedbackId to set
     */
    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    /**
     * @return the feedbackType
     */
    public String getFeedbackType() {
        return feedbackType;
    }

    /**
     * @param feedbackType the feedbackType to set
     */
    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
}
