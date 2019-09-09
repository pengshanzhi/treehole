package com.psz.treehole;

import java.io.Serializable;

/**
 * tz
 * @author 
 */
public class Tz extends TzKey implements Serializable {
    private String ttitle;

    private String tcontent;
    
    private String tusername;

    private static final long serialVersionUID = 1L;

    public String getTtitle() {
        return ttitle;
    }

    public void setTtitle(String ttitle) {
        this.ttitle = ttitle;
    }

    public String getTcontent() {
        return tcontent;
    }

    public void setTcontent(String tcontent) {
        this.tcontent = tcontent;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tz other = (Tz) obj;
		if (tcontent == null) {
			if (other.tcontent != null)
				return false;
		} else if (!tcontent.equals(other.tcontent))
			return false;
		if (ttitle == null) {
			if (other.ttitle != null)
				return false;
		} else if (!ttitle.equals(other.ttitle))
			return false;
		if (tusername == null) {
			if (other.tusername != null)
				return false;
		} else if (!tusername.equals(other.tusername))
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tcontent == null) ? 0 : tcontent.hashCode());
		result = prime * result + ((ttitle == null) ? 0 : ttitle.hashCode());
		result = prime * result + ((tusername == null) ? 0 : tusername.hashCode());
		return result;
	}

    @Override
	public String toString() {
		return "Tz [ttitle=" + ttitle + ", tcontent=" + tcontent + ", tusername=" + tusername + "]";
	}

	public String getTusername() {
		return tusername;
	}

	public void setTusername(String tusername) {
		this.tusername = tusername;
	}
}