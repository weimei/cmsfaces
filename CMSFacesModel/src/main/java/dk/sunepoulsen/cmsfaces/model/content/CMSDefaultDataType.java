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
 * @brief 
 * 
 */
public class CMSDefaultDataType implements CMSDataType {
    //-------------------------------------------------------------------------
    //              Constructors
    //-------------------------------------------------------------------------

    public CMSDefaultDataType() {        
    }
    
    //-------------------------------------------------------------------------
    //              CMSDataType interface
    //-------------------------------------------------------------------------

    //!\name Properties
    //@{
    public String getId() {
        return this.id;
    }

    public void setId( String newId ) throws IllegalArgumentException {
        if( newId.isEmpty() ) {
            throw new IllegalArgumentException( "An id can not be empty of a CMS data type." );
        }
        if( newId.contains( " " ) ) {
            throw new IllegalArgumentException( "An id can not contain spaces of a CMS data type." );
        }

        this.id = newId;
    }

    public String getName() {
        return this.name;
    }

    public void setName( String newName ) throws IllegalArgumentException {
        this.name = newName;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel( String newLabel ) throws IllegalArgumentException {
        this.label = newLabel;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription( String newDescription ) throws IllegalArgumentException {
        this.description = newDescription;
    }

    public Class getCompatibleClass() {
        return this.compatibleClass;
    }

    public void setCompatibleClass( Class newClass ) {
        this.compatibleClass = newClass;
    }

    public boolean isCompatible( Object obj ) {
        if( this.compatibleClass == null ) {
            return obj == null;
        }

        if( obj != null ) {
            return this.compatibleClass.isInstance( obj );
        }
                
        return false;
    }
    //@}

    //-------------------------------------------------------------------------
    //              Private section
    //-------------------------------------------------------------------------
    
    //!\name Attributes
    //@{
    /**
     * @brief Id of this data type.
     */
    private String id;

    /**
     * @brief Name of this data type.
     */
    private String name;

    /**
     * @brief Label of this data type.
     */
    private String label;

    /**
     * @brief Desciption of this data type.
     */
    private String description;
    
    /**
     * @brief Compatible class of this data type.
     */
    private Class compatibleClass;
    //@}
}
