package com.psz.treehole;

import java.io.Serializable;

/**
 * tz
 * @author 
 */
public class TzKey implements Serializable {
    private Integer tpage;

    private Integer tno;

    private static final long serialVersionUID = 1L;

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
        TzKey other = (TzKey) that;
        return (this.getTpage() == null ? other.getTpage() == null : this.getTpage().equals(other.getTpage()))
            && (this.getTno() == null ? other.getTno() == null : this.getTno().equals(other.getTno()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
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
        sb.append(", tpage=").append(tpage);
        sb.append(", tno=").append(tno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}