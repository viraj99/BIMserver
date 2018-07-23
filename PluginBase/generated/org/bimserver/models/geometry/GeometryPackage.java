/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.geometry;

/******************************************************************************
 * Copyright (C) 2009-2018  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bimserver.models.geometry.GeometryFactory
 * @model kind="package"
 * @generated
 */
public interface GeometryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geometry";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "geometry";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geometry";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometryPackage eINSTANCE = org.bimserver.models.geometry.impl.GeometryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.GeometryInfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.GeometryInfoImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryInfo()
	 * @generated
	 */
	int GEOMETRY_INFO = 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__BOUNDS = 0;

	/**
	 * The feature id for the '<em><b>Bounds Untransformed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__BOUNDS_UNTRANSFORMED = 1;

	/**
	 * The feature id for the '<em><b>Start Vertex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__START_VERTEX = 2;

	/**
	 * The feature id for the '<em><b>Start Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__START_INDEX = 3;

	/**
	 * The feature id for the '<em><b>Primitive Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__PRIMITIVE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__DATA = 5;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__TRANSFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__AREA = 7;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__VOLUME = 8;

	/**
	 * The feature id for the '<em><b>Has Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__HAS_TRANSPARENCY = 9;

	/**
	 * The feature id for the '<em><b>Ifc Product Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__IFC_PRODUCT_OID = 10;

	/**
	 * The feature id for the '<em><b>Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__DENSITY = 11;

	/**
	 * The feature id for the '<em><b>Bounds Mm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__BOUNDS_MM = 12;

	/**
	 * The feature id for the '<em><b>Bounds Untransformed Mm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO__BOUNDS_UNTRANSFORMED_MM = 13;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_INFO_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.Vector3fImpl <em>Vector3f</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.Vector3fImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getVector3f()
	 * @generated
	 */
	int VECTOR3F = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F__Z = 2;

	/**
	 * The number of structural features of the '<em>Vector3f</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR3F_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.BoundsImpl <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.BoundsImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getBounds()
	 * @generated
	 */
	int BOUNDS = 2;

	/**
	 * The feature id for the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__MAX = 1;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.GeometryDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.GeometryDataImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryData()
	 * @generated
	 */
	int GEOMETRY_DATA = 3;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__INDICES = 0;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__VERTICES = 1;

	/**
	 * The feature id for the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__NORMALS = 2;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__MATERIALS = 3;

	/**
	 * The feature id for the '<em><b>Material Indices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__MATERIAL_INDICES = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__COLOR = 5;

	/**
	 * The feature id for the '<em><b>Has Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__HAS_TRANSPARENCY = 6;

	/**
	 * The feature id for the '<em><b>Reused</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__REUSED = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Most Used Color</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__MOST_USED_COLOR = 9;

	/**
	 * The feature id for the '<em><b>Bounds Mm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__BOUNDS_MM = 10;

	/**
	 * The feature id for the '<em><b>Normals Quantized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__NORMALS_QUANTIZED = 11;

	/**
	 * The feature id for the '<em><b>Vertices Quantized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__VERTICES_QUANTIZED = 12;

	/**
	 * The feature id for the '<em><b>Colors Quantized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA__COLORS_QUANTIZED = 13;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_DATA_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.bimserver.models.geometry.impl.Vector4fImpl <em>Vector4f</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bimserver.models.geometry.impl.Vector4fImpl
	 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getVector4f()
	 * @generated
	 */
	int VECTOR4F = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4F__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4F__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4F__Z = 2;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4F__W = 3;

	/**
	 * The number of structural features of the '<em>Vector4f</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR4F_FEATURE_COUNT = 4;

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.GeometryInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo
	 * @generated
	 */
	EClass getGeometryInfo();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounds</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getBounds()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_Bounds();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getBoundsUntransformed <em>Bounds Untransformed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounds Untransformed</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getBoundsUntransformed()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_BoundsUntransformed();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getStartVertex <em>Start Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Vertex</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getStartVertex()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_StartVertex();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getStartIndex <em>Start Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Index</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getStartIndex()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_StartIndex();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getPrimitiveCount <em>Primitive Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Count</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getPrimitiveCount()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_PrimitiveCount();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getData()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getTransformation()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getArea()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_Area();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getVolume()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#isHasTransparency <em>Has Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Transparency</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#isHasTransparency()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_HasTransparency();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getIfcProductOid <em>Ifc Product Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifc Product Oid</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getIfcProductOid()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_IfcProductOid();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryInfo#getDensity <em>Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Density</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getDensity()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EAttribute getGeometryInfo_Density();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getBoundsMm <em>Bounds Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounds Mm</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getBoundsMm()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_BoundsMm();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryInfo#getBoundsUntransformedMm <em>Bounds Untransformed Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounds Untransformed Mm</em>'.
	 * @see org.bimserver.models.geometry.GeometryInfo#getBoundsUntransformedMm()
	 * @see #getGeometryInfo()
	 * @generated
	 */
	EReference getGeometryInfo_BoundsUntransformedMm();

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector3f</em>'.
	 * @see org.bimserver.models.geometry.Vector3f
	 * @generated
	 */
	EClass getVector3f();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector3f#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.bimserver.models.geometry.Vector3f#getX()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_X();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector3f#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.bimserver.models.geometry.Vector3f#getY()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector3f#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.bimserver.models.geometry.Vector3f#getZ()
	 * @see #getVector3f()
	 * @generated
	 */
	EAttribute getVector3f_Z();

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.Bounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see org.bimserver.models.geometry.Bounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.Bounds#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Min</em>'.
	 * @see org.bimserver.models.geometry.Bounds#getMin()
	 * @see #getBounds()
	 * @generated
	 */
	EReference getBounds_Min();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.Bounds#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Max</em>'.
	 * @see org.bimserver.models.geometry.Bounds#getMax()
	 * @see #getBounds()
	 * @generated
	 */
	EReference getBounds_Max();

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.GeometryData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.bimserver.models.geometry.GeometryData
	 * @generated
	 */
	EClass getGeometryData();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indices</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getIndices()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Indices();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertices</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getVertices()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Vertices();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getNormals <em>Normals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getNormals()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Normals();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Materials</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getMaterials()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Materials();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getMaterialIndices <em>Material Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Material Indices</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getMaterialIndices()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_MaterialIndices();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryData#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Color</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getColor()
	 * @see #getGeometryData()
	 * @generated
	 */
	EReference getGeometryData_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#isHasTransparency <em>Has Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Transparency</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#isHasTransparency()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_HasTransparency();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getReused <em>Reused</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reused</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getReused()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Reused();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getType()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_Type();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryData#getMostUsedColor <em>Most Used Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Most Used Color</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getMostUsedColor()
	 * @see #getGeometryData()
	 * @generated
	 */
	EReference getGeometryData_MostUsedColor();

	/**
	 * Returns the meta object for the reference '{@link org.bimserver.models.geometry.GeometryData#getBoundsMm <em>Bounds Mm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bounds Mm</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getBoundsMm()
	 * @see #getGeometryData()
	 * @generated
	 */
	EReference getGeometryData_BoundsMm();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getNormalsQuantized <em>Normals Quantized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normals Quantized</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getNormalsQuantized()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_NormalsQuantized();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getVerticesQuantized <em>Vertices Quantized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertices Quantized</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getVerticesQuantized()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_VerticesQuantized();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.GeometryData#getColorsQuantized <em>Colors Quantized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colors Quantized</em>'.
	 * @see org.bimserver.models.geometry.GeometryData#getColorsQuantized()
	 * @see #getGeometryData()
	 * @generated
	 */
	EAttribute getGeometryData_ColorsQuantized();

	/**
	 * Returns the meta object for class '{@link org.bimserver.models.geometry.Vector4f <em>Vector4f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector4f</em>'.
	 * @see org.bimserver.models.geometry.Vector4f
	 * @generated
	 */
	EClass getVector4f();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector4f#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.bimserver.models.geometry.Vector4f#getX()
	 * @see #getVector4f()
	 * @generated
	 */
	EAttribute getVector4f_X();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector4f#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.bimserver.models.geometry.Vector4f#getY()
	 * @see #getVector4f()
	 * @generated
	 */
	EAttribute getVector4f_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector4f#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see org.bimserver.models.geometry.Vector4f#getZ()
	 * @see #getVector4f()
	 * @generated
	 */
	EAttribute getVector4f_Z();

	/**
	 * Returns the meta object for the attribute '{@link org.bimserver.models.geometry.Vector4f#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see org.bimserver.models.geometry.Vector4f#getW()
	 * @see #getVector4f()
	 * @generated
	 */
	EAttribute getVector4f_W();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometryFactory getGeometryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.GeometryInfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.GeometryInfoImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryInfo()
		 * @generated
		 */
		EClass GEOMETRY_INFO = eINSTANCE.getGeometryInfo();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__BOUNDS = eINSTANCE.getGeometryInfo_Bounds();

		/**
		 * The meta object literal for the '<em><b>Bounds Untransformed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__BOUNDS_UNTRANSFORMED = eINSTANCE.getGeometryInfo_BoundsUntransformed();

		/**
		 * The meta object literal for the '<em><b>Start Vertex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__START_VERTEX = eINSTANCE.getGeometryInfo_StartVertex();

		/**
		 * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__START_INDEX = eINSTANCE.getGeometryInfo_StartIndex();

		/**
		 * The meta object literal for the '<em><b>Primitive Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__PRIMITIVE_COUNT = eINSTANCE.getGeometryInfo_PrimitiveCount();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__DATA = eINSTANCE.getGeometryInfo_Data();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__TRANSFORMATION = eINSTANCE.getGeometryInfo_Transformation();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__AREA = eINSTANCE.getGeometryInfo_Area();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__VOLUME = eINSTANCE.getGeometryInfo_Volume();

		/**
		 * The meta object literal for the '<em><b>Has Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__HAS_TRANSPARENCY = eINSTANCE.getGeometryInfo_HasTransparency();

		/**
		 * The meta object literal for the '<em><b>Ifc Product Oid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__IFC_PRODUCT_OID = eINSTANCE.getGeometryInfo_IfcProductOid();

		/**
		 * The meta object literal for the '<em><b>Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_INFO__DENSITY = eINSTANCE.getGeometryInfo_Density();

		/**
		 * The meta object literal for the '<em><b>Bounds Mm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__BOUNDS_MM = eINSTANCE.getGeometryInfo_BoundsMm();

		/**
		 * The meta object literal for the '<em><b>Bounds Untransformed Mm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_INFO__BOUNDS_UNTRANSFORMED_MM = eINSTANCE.getGeometryInfo_BoundsUntransformedMm();

		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.Vector3fImpl <em>Vector3f</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.Vector3fImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getVector3f()
		 * @generated
		 */
		EClass VECTOR3F = eINSTANCE.getVector3f();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__X = eINSTANCE.getVector3f_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__Y = eINSTANCE.getVector3f_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR3F__Z = eINSTANCE.getVector3f_Z();

		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.BoundsImpl <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.BoundsImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDS__MIN = eINSTANCE.getBounds_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDS__MAX = eINSTANCE.getBounds_Max();

		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.GeometryDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.GeometryDataImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getGeometryData()
		 * @generated
		 */
		EClass GEOMETRY_DATA = eINSTANCE.getGeometryData();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__INDICES = eINSTANCE.getGeometryData_Indices();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__VERTICES = eINSTANCE.getGeometryData_Vertices();

		/**
		 * The meta object literal for the '<em><b>Normals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__NORMALS = eINSTANCE.getGeometryData_Normals();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__MATERIALS = eINSTANCE.getGeometryData_Materials();

		/**
		 * The meta object literal for the '<em><b>Material Indices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__MATERIAL_INDICES = eINSTANCE.getGeometryData_MaterialIndices();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_DATA__COLOR = eINSTANCE.getGeometryData_Color();

		/**
		 * The meta object literal for the '<em><b>Has Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__HAS_TRANSPARENCY = eINSTANCE.getGeometryData_HasTransparency();

		/**
		 * The meta object literal for the '<em><b>Reused</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__REUSED = eINSTANCE.getGeometryData_Reused();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__TYPE = eINSTANCE.getGeometryData_Type();

		/**
		 * The meta object literal for the '<em><b>Most Used Color</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_DATA__MOST_USED_COLOR = eINSTANCE.getGeometryData_MostUsedColor();

		/**
		 * The meta object literal for the '<em><b>Bounds Mm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_DATA__BOUNDS_MM = eINSTANCE.getGeometryData_BoundsMm();

		/**
		 * The meta object literal for the '<em><b>Normals Quantized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__NORMALS_QUANTIZED = eINSTANCE.getGeometryData_NormalsQuantized();

		/**
		 * The meta object literal for the '<em><b>Vertices Quantized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__VERTICES_QUANTIZED = eINSTANCE.getGeometryData_VerticesQuantized();

		/**
		 * The meta object literal for the '<em><b>Colors Quantized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_DATA__COLORS_QUANTIZED = eINSTANCE.getGeometryData_ColorsQuantized();

		/**
		 * The meta object literal for the '{@link org.bimserver.models.geometry.impl.Vector4fImpl <em>Vector4f</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bimserver.models.geometry.impl.Vector4fImpl
		 * @see org.bimserver.models.geometry.impl.GeometryPackageImpl#getVector4f()
		 * @generated
		 */
		EClass VECTOR4F = eINSTANCE.getVector4f();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4F__X = eINSTANCE.getVector4f_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4F__Y = eINSTANCE.getVector4f_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4F__Z = eINSTANCE.getVector4f_Z();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VECTOR4F__W = eINSTANCE.getVector4f_W();

	}

} //GeometryPackage
