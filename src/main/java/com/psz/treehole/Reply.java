package com.psz.treehole;

import java.io.Serializable;

/**
 * reply
 * @author 
 */
public class Reply implements Serializable {
    private Integer rno;

    private String rusername;

    private String rcontent;

    private Integer tpage;

    private Integer tno;

    private static final long serialVersionUID = 1L;

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public String getRusername() {
        return rusername;
    }

    public void setRusername(String rusername) {
        this.rusername = rusername;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public Integer getTpage() {
        return tpage;
    }

    public void setTpage(Integer tpage) {
        this.tpage = tpage;
    }

    public Integer getTno() {
        return tno;
    }

    public void setTno(Integer tno) {
        this.tno = tno;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Reply other = (Reply) that;
        return (this.getRno() == null ? other.getRno() == null : this.getRno().equals(other.getRno()))
            && (this.getRusername() == null ? other.getRusername() == null : this.getRusername().equals(other.getRusername()))
            && (this.getRcontent() == null ? other.getRcontent() == null : this.getRcontent().equals(other.getRcontent()))
            && (this.getTpage() == null ? other.getTpage() == null : this.getTpage().equals(other.getTpage()))
            && (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRno() == null) ? 0 : getRno().hashCode());
        result = prime * result + ((getRusername() == null) ? 0 : getRusername().hashCode());
        result = prime * result + ((getRcontent() == null) ? 0 : getRcontent().hashCode());
        result = prime * result + ((getTpage() == null) ? 0 : getTpage().hashCode());
        result = prime * result + ((getTno() == null) ? 0 : getTno().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rno=").append(rno);
        sb.append(", rusername=").append(rusername);
        sb.append(", rcontent=").append(rcontent);
        sb.append(", tpage=").append(tpage);
        sb.append(", tno=").append(tno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}