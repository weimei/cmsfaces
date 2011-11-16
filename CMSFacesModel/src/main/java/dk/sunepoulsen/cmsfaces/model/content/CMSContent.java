//-----------------------------------------------------------------------------
/*
 * Copyright (C) 2011 sunepoulsen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
//-----------------------------------------------------------------------------
package dk.sunepoulsen.cmsfaces.model.content;

//-----------------------------------------------------------------------------
/**
 * @brief Defines the interface of content in CMSFaces. All content types will 
 *        implement this interface.
 * 
 */
public interface CMSContent {
    //!\name Data store
    //@{
    /**
     * Returns the data store identifier for this content.
     * 
     * @return A data store identifier. 
     */
    public String getDataStoreIdentifier();
    
    /**
     * Sets the data store identifier of this content.
     * 
     * @param newIdent The new data store identifier of this content.
     *
     */
    public void setDataStoreIdentifier( String newIdent );
    //@}
}
