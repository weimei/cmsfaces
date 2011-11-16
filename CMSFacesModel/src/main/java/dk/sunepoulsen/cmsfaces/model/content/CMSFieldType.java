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
 * @brief Defines the interface of a field type, that each field in a content
 *        type has to be associated with.
 * 
 */
public interface CMSFieldType {
    //!\name Architecture properties
    //@{
    /**
     * @brief Returns the internal id of this field type.
     */
    public String getId();
    
    /**
     * @brief Sets the internal id of this field type.
     * 
     * @param id The new internal id.
     */
    public void setId( String id );
    //@}
    
    //!\name Properties
    //@{
    /**
     * @brief Returns the data type of this field type.
     */
    public int getDataType();
    
    /**
     * @brief Sets the data type of this field type.
     * 
     * @param type The new field type.
     */
    public void setDataType( int type );
    
    /**
     * @brief Returns the label of this field type.
     * 
     * The label is used in GUI's, so it is posible to give the user an idea
     * of the use of this type.
     */
    public String getLabel();
    
    /**
     * @brief Sets the label of this field type.
     * 
     * @param label The new label.
     */
    public void setLabel( String label);
    
    /**
     * @brief Returns the description of this field type.
     * 
     * Used in GUI's for better usability.
     */
    public String getDescription();
    
    /**
     * @brief Sets the description of this field type.
     * 
     * @param description The new description.
     */
    public void setDescription( String description );
    //@}
}
