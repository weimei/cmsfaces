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
 * @brief Declares the interface of a CMS data type, that can be associated
 *        with CMS fields and field definition.
 * 
 */
public interface CMSDataType {
    //!\name Properties
    //@{
    /**
     * @brief Returns the id of this data type.
     * 
     * @return The id.
     */
    public String getId();
    
    /**
     * @brief Sets the id of this data type.
     * 
     * @param newId The new id.
     * 
     * @exception IllegalArgumentException Throwed if @e newId is illegal.
     *
     */
    public void setId( String newId ) throws IllegalArgumentException;

    /**
     * @brief Returns the name of this data type.
     * 
     * @return The name.
     */
    public String getName();
    
    /**
     * @brief Sets the name of this data type.
     * 
     * @param newName The new name.
     * 
     * @exception IllegalArgumentException Throwed if @e newName is illegal.
     *
     */
    public void setName( String newName ) throws IllegalArgumentException;

    /**
     * @brief Returns the label of this data type.
     * 
     * @return The label.
     */
    public String getLabel();
    
    /**
     * @brief Sets the label of this data type.
     * 
     * @param newLabel The new label.
     * 
     * @exception IllegalArgumentException Throwed if @e newLabel is illegal.
     *
     */
    public void setLabel( String newLabel ) throws IllegalArgumentException;

    /**
     * @brief Returns the dedcription of this data type.
     * 
     * @return The description.
     */
    public String getDescription();
    
    /**
     * @brief Sets the description of this data type.
     * 
     * @param newDescription The new description.
     * 
     * @exception IllegalArgumentException Throwed if @e newDescription is illegal.
     *
     */
    public void setDescription( String newDescription ) throws IllegalArgumentException;
    
    /**
     * @brief Returns the Class object that objects has to be compatible with
     *        to be used with this data type.
     * 
     * @return An instance of Class
     */
    public Class getCompatibleClass();

    /**
     * @brief Sets the Class object that objects has to be compatible with
     *        to be used with this data type.
     * 
     * @param newClass The new Class object.
     */
    public void setCompatibleClass( Class newClass );
    //@}
    
    //!\name Validation
    //@{
    /**
     * @brief Checks if @e obj to compatible with this data type.
     */
    public boolean isCompatible( Object obj );
    //@}
}
